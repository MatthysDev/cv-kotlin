package network.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class ApiQuiz {
    private val apiUrl = "https://awl.li/devoxxkmm2023"
    private val httpClient = createHttpClient()

    suspend fun getAllQuestions(): Quiz {
        return httpClient.get(apiUrl).body()
    }

    private fun createHttpClient(): HttpClient {
        return HttpClient {
            install(ContentNegotiation) {
                json(
                    contentType = ContentType.Text.Plain, // because Github is not returning an 'application/json' header
                    json = Json {
                        ignoreUnknownKeys = true
                        useAlternativeNames = false
                    })
            }
        }
    }
}
