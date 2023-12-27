package network.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch
import network.data.Question

class fetchQuiz {

    private val quizAPI = ApiQuiz()
    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    private val _questionState = MutableStateFlow<List<Question>>(emptyList())
    val questionState = _questionState.asStateFlow()

    init {
        updateQuiz()
    }

    private suspend fun fetchQuiz(): List<Question> = quizAPI.getAllQuestions().questions

    private fun updateQuiz() {
        coroutineScope.launch {
            _questionState.value = fetchQuiz()
        }
    }
}
