package com.moony.offlinemusic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.moony.common.SlideUpLayout
import com.moony.music_player.MusicScreen
import com.moony.music_player.component.TopBar


@Composable
fun MainScreen() {
    val snackBarHostState = remember { SnackbarHostState() }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        snackbarHost = {
            SnackbarHost(snackBarHostState)
        }
    ) { innerPadding ->
        SlideUpLayout(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            slideContent = {
                MusicScreen(modifier = Modifier.fillMaxSize())
            },
            backgroundContent = {}
        )

    }
}
