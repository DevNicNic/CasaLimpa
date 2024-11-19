package com.nicnicdev.suacasasemprelimpa.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nicnicdev.suacasasemprelimpa.R

@Composable
fun VerticalButtonScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(vertical = 32.dp, horizontal = 16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // primeiro botão
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = { /* ação do primeiro botão*/ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Casa Sempre Limpa Dicas")
            }

            Image(
                painter = painterResource(id = R.drawable.imagem1),
                contentDescription = "Imagem para Dicas",
                modifier = Modifier.size(240.dp) //define o tamanho da imagem
            )
        }

        //segundo botão
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = { /*Ação do segundo botão*/ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Agendar Tarefas Diárias")
            }

            Image(
                painter = painterResource(id = R.drawable.imagem2),
                contentDescription = "Imagem para Agendar Tarefas Diárias",
                modifier = Modifier.size(240.dp) //define o tamanho da imagem
            )

        }

        // terceiro botão
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = {/*ação do terceiro botão*/ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Agendar Tarefas Semanais ")
            }

            Image(
                painter = painterResource(id = R.drawable.imagem3),
                contentDescription = "Imagem para Agendar Tarefas Semanais",
                modifier = Modifier.size(240.dp) //define o tamanho da imagem
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VerticalButtonScreenPreview() {
    VerticalButtonScreen()
}