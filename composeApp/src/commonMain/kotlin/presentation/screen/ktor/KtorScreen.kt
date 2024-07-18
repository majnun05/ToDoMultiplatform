package presentation.screen.ktor

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen

class KtorScreen: Screen {

    @Composable
    override fun Content() {
        Scaffold(
            modifier = Modifier.fillMaxSize().safeDrawingPadding(),

        ) {

        }
    }
}