package com.example.kobweb.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.height
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.SilkStyleSheet.style
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.theme.colors.palette.SilkWidgetKobwebColorGroups
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.CSSSelector.PseudoClass.hover
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.lavender) // Dark background
            .padding(24.px),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header Section
            SpanText(
                "Welcome to Kobweb Website",
                modifier = Modifier
                    .margin(bottom = 16.px)
                    .fontSize(40.px)
                    .color(Color.black) // Title text color
            )

            Row(Modifier.flexWrap(FlexWrap.Wrap)) {
                SpanText("Create rich, dynamic web apps with ease, leveraging ")
                Link("https://kotlinlang.org/", "Kotlin")
                SpanText(" and ")
                Link("https://github.com/JetBrains/compose-multiplatform#compose-html/", "Compose HTML")
            }

            // Subtitle Section
            SpanText(
                "Building websites with Kotlin, Compose, and Kobweb.",
                modifier = Modifier
                    .margin(top = 24.px, bottom = 24.px)
                    .fontSize(22.px)
                    .color(Color(0xFF61DAFB.toString())) // Subtitle in light blue
            )

            // Action Button
            Link(
                path = "/portfolio",
                modifier = Modifier
                    .background(Color(0xFF61DAFB.toString()))
                    .color(Color.black)
                    .border(width = 2.px, color = Color.white)
                    .margin(bottom = 32.px)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Explore My Work")
                    SpanText(
                        "→",
                        modifier = Modifier.fontSize(18.px).color(Color.black),
                    )
                }
            }

            // Social Media Links Section
            Row(
                modifier = Modifier.margin(bottom = 32.px),
                horizontalArrangement = Arrangement.spacedBy(16.px)
            ) {
                Link(path = "https://github.com") {
                    FaGithub(modifier = Modifier.size(24.px).color(Color.black))
                }
                Link(path = "https://linkedin.com") {
                    FaLinkedin(modifier = Modifier.size(24.px).color(Color.black))
                }
                Link(path = "https://twitter.com") {
                    FaTwitter(modifier = Modifier.size(24.px).color(Color.black))
                }
            }

            // Footer Section
            SpanText(
                "© 2024 by Musab Umair. Proudly created with Kotlin & Kobweb",
                modifier = Modifier
                    .margin(top = 32.px)
                    .fontSize(18.px)
                    .color(Color(0xFF888888.toString())) // Light gray footer text
            )
        }
    }
}

