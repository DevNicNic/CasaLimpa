package com.nicnicdev.suacasasemprelimpa.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nicnicdev.suacasasemprelimpa.R

@Composable
fun BotaoComImagem(
    textoBotao: String,
    descricaoImagem: String,
    recursoImagem: Int,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Button(
            onClick = onClick,
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(0.dp) // remove o padding interno do botão
        ) {
            Text(text = textoBotao)
        }

        Spacer(modifier = Modifier.height(0.dp)) //espaçamento entre o botão e a imagem


        Image(
            painter = painterResource(id = recursoImagem),
            contentDescription = descricaoImagem,
            modifier = Modifier
                .size(240.dp) // define o tamanho da imagem
                .align(Alignment.CenterHorizontally),
            )
    }


}

@Composable
fun ButtonsVerticalScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(vertical = 32.dp, horizontal = 16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotaoComImagem(
            textoBotao = "Casa Sempre Limpa Dicas",
            descricaoImagem = "Imagem para Dicas",
            recursoImagem = R.drawable.imagem1,
            onClick = {/* ação do primeiro botão*/ }
        )

        BotaoComImagem(
            textoBotao = "Agendar Tarefas Diárias",
            descricaoImagem = "Imagem para Agendar Tarefas Diárias",
            recursoImagem = R.drawable.imagem2,
            onClick = {/* ação do segundo botão*/ }
        )

        BotaoComImagem(
            textoBotao = "Agendar Tarefas Semanais",
            descricaoImagem = "Imagem para Agendar Tarefas Samanais",
            recursoImagem = R.drawable.imagem3,
            onClick = {/* ação do terceiro botão*/ }
        )

    }
}

@Preview(showBackground = true)
@Composable
fun ButtonsVerticalScreenPreview() {
    ButtonsVerticalScreen()
}