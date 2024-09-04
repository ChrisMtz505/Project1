package com.example.project1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
        val age = 20
        val name = "Ricardo Reyes"
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

// Funciones de UI (no cambian)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Project1Theme {
        Greeting("Android")
    }
}
