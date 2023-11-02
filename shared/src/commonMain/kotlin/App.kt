import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.Gray) // Change the background color of the entire screen
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            CustomCard("Matthys Ducrocq", description = "Developpeur React Native", date = "Depuis 2018")
            BoldCenteredText("Formation")
            CustomCard("IUT Du Littoral", description = "Licence Professionnelle", date = "2019-2020")
            CustomCard("Efficom", description = "Mastère Management Web",date="2020-2021")
            BoldCenteredText("Expérience")
            CustomCard("Ecole de musique", description = "Création d'un site web", date = "Mai 2020")
            CustomCard("weshipit", description = "Alternance de 3 ans en tant que développeur React Native", date = "Septembre 2020 - Aujourd'hui")
        }
    }
}

expect fun getPlatformName(): String
