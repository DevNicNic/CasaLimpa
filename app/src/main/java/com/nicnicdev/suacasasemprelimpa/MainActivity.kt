package com.nicnicdev.suacasasemprelimpa

import androidx.compose.material3.Button
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nicnicdev.suacasasemprelimpa.ui.theme.SuaCasaSempreLimpaTheme
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuaCasaSempreLimpaTheme {
                // A surface container using the 'background' color from the theme
                MyFirstScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyFirstScreen() {
    Scaffold { contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween, //deixa o botão no rodapé
            horizontalAlignment = Alignment.CenterHorizontally //centraliza o conteúdo horizontalmente
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp), //ajusta os espaço entre os textos
                horizontalAlignment = Alignment.CenterHorizontally // centraliza os textos
            ) {
                Text(text = "Sua", style = MaterialTheme.typography.headlineLarge)
                Text(text = "Casa", style = MaterialTheme.typography.headlineLarge)
                Text(text = "Sempre Limpa", style = MaterialTheme.typography.headlineLarge)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally) //deixa o botão centralizado
                    .padding(bottom = 70.dp), //espaçamento do rodapé
                onClick = {/*Ação do botão*/ }
            ) {
                Text(text = "CADASTRE - SE")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyFirstScreen() {
    SuaCasaSempreLimpaTheme {
        MyFirstScreen()
    }
}

