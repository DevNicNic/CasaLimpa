package com.nicnicdev.suacasasemprelimpa

import androidx.compose.material3.Button
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue




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
    var login by remember { mutableStateOf("") } // estado para login
    var password by remember { mutableStateOf("") } // estado para senha

    Scaffold { contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween, //deixa o botão no rodapé
            horizontalAlignment = Alignment.CenterHorizontally //centraliza o conteúdo horizontalmente
        ) {
            //coluna separada para os textos
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp), //ajusta os espaço entre os textos
                horizontalAlignment = Alignment.CenterHorizontally // centraliza os textos
            ) {
                Text(text = "Sua", style = MaterialTheme.typography.headlineLarge)
                Text(text = "Casa", style = MaterialTheme.typography.headlineLarge)
                Text(text = "Sempre Limpa", style = MaterialTheme.typography.headlineLarge)
            }
            Spacer(modifier = Modifier.height(20.dp))

            //coluna separada para os campos de login , senha e botão entrar
            Column(
                verticalArrangement = Arrangement.spacedBy(0.dp), // espaçamento entre as caixas login e senha
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally // centraliza o botão 

            ) {
                // campo de login
                OutlinedTextField(
                    value = login,
                    onValueChange = { login = it },
                    label = { Text("Login") },
                    modifier = Modifier.fillMaxWidth()
                )

                // campo senha
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Senha") },
                    modifier = Modifier.fillMaxWidth(),
                    visualTransformation = PasswordVisualTransformation() // para ocultar a senha
                )

                // texto clicavel "Esqueci a senha "
                Text(
                    text = "Esqueci a senha.",
                    modifier = Modifier
                        .align(Alignment.End) // alinhamento á direita
                        .padding(top = 8.dp)
                        .clickable { /* Ação ao clicar no textp*/ },
                    style = MaterialTheme.typography.bodySmall // estilo do texto
                )
                // botão entrar 
                Button(
                    onClick = { /* Ação ao clicar em Entrar*/ },
                    modifier = Modifier
                        .padding(top = 26.dp) // largura extra acima do botão
                        .width(200.dp) // largura do botão
                ) {
                    Text(text = "Entrar")
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally) //deixa o botão centralizado
                    .padding(bottom = 40.dp), //espaçamento do rodapé
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

