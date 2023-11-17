import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import network.data.Answer
import network.data.Question

@Composable
internal fun App() {
    MaterialTheme {
        val questions = listOf(
            Question(
                1,
                "What is the capital of France?",
                2,
                listOf(
                    Answer(1, "Berlin"),
                    Answer(2, "Paris"),
                    Answer(3, "London"),
                    Answer(4, "Madrid")
                )
            ),
            Question(
                2,
                "Which programming language is officially supported for Android development?",
                3,
                listOf(
                    Answer(1, "Swift"),
                    Answer(2, "Java"),
                    Answer(3, "Kotlin"),
                    Answer(4, "C++")
                )
            )
        )
        questionScreen(questions)
    }
}

