package com.example.walletsuiny

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.bytebeats.views.charts.bar.BarChart
import me.bytebeats.views.charts.bar.BarChartData
import me.bytebeats.views.charts.bar.render.label.SimpleLabelDrawer
import me.bytebeats.views.charts.bar.render.xaxis.SimpleXAxisDrawer
import me.bytebeats.views.charts.bar.render.yaxis.SimpleYAxisDrawer

@Composable
fun SpendingGraph(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = "Spending Statistics",
        fontFamily = Font(R.font.play).toFontFamily(),
        fontSize = 25.sp
    )

    Spacer(modifier = Modifier.height(16.dp))

    Chart(modifier = modifier)
}

@Composable
fun Chart(modifier: Modifier = Modifier) {
    Box(modifier = modifier.height(220.dp)) {
        BarChart(
            barChartData = BarChartData(spendingByDay),
            xAxisDrawer = SimpleXAxisDrawer(
                axisLineThickness = 2.dp,
                axisLineColor = MaterialTheme.colorScheme.onBackground.copy(0.2f)
            ),
            yAxisDrawer = SimpleYAxisDrawer(
                labelValueFormatter = { "$ ${it.toInt()}" },
                axisLineThickness = 2.dp,
                axisLineColor = MaterialTheme.colorScheme.onBackground.copy(0.2f)
            ),
            labelDrawer = SimpleLabelDrawer(
                drawLocation = SimpleLabelDrawer.DrawLocation.Outside,
                labelTextSize = 15.sp
            )
        )
    }
}

val spendingByDay = listOf(
    BarChartData.Bar(
        label = "Dec 1",
        value = 123f,
        color = randomColor(50),
    ),
    BarChartData.Bar(
        label = "Dec 2",
        value = 160f,
        color = randomColor(50),
    ),
    BarChartData.Bar(
        label = "Dec 3",
        value = 204f,
        color = randomColor(50),
    ),
    BarChartData.Bar(
        label = "Dec 4",
        value = 34f,
        color = randomColor(50),
    ),
    BarChartData.Bar(
        label = "Dec 5",
        value = 74f,
        color = randomColor(50),
    )
)