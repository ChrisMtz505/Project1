package com.example.project1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project1.ui.theme.Project1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        // Ejecutar las funciones de ejemplo
        val age = 21
        val name = "Christopher Martínez"
        val names = arrayOf("Erick", "Silvia", "Hector", "Gabriela")
        println(age)
        println("Welcome $name, to your first Kotlin project")
        println(add())
        println(product(10, 92))
        printArray(names)
        println(names.joinToString())
        val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        isEven(numbers)
        println(getDay(4))
        val person = Person("Andrea", 22)
        println(person.name)
        println(person.age)
        person.displayInformation()
    }
}

// Funciones añadidas desde el otro archivo
fun add(): Int {
    val x = 5
    val y = 10
    return x + y
}

fun product(x: Int, y: Int): Int {
    return x * y
}

fun printArray(names: Array<String>) {
    for (name in names) {
        println("Hello $name")
    }
}

fun isEven(numbers: Array<Int>) {
    for (number in numbers) {
        if (number % 2 == 0) {
            println("The number $number is Even")
        } else {
            println("The number $number is Odd")
        }
    }
}

fun getDay(day: Int): String {
    return when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Incorrect value"
    }
}

class Person(val name: String, val age: Int) {
    fun displayInformation() {
        println("Name: $name, Age: $age")
    }
}

// Nueva función de UI con el Card
@Composable
fun Content1() {
    Card(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(5.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                text = "This is a title",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android Logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(R.string.text_card),
                textAlign = TextAlign.Justify,
                lineHeight = 18.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}

// Función Greeting
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

// Preview para ver la interfaz
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Project1Theme {
        Content1()
    }
}
