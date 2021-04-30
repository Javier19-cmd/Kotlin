package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesYConstantes() //Instancia del método variablesYContantes
        //TiposdeDatos()

        sentenciaIf()
    }

    //Función encargada de contener operaciones con variables y constantes.
    private fun variablesYConstantes()
    {
        //Variables
        var myFirstVariable = "Esta es una prueba" //Variable de tipo String.
        var myFirstNumbrer = 4                     //Variable de tipo integer.

        //Print de las variables.
        println(myFirstVariable)
        println(myFirstNumbrer)


        myFirstVariable = "Prueba" //Modificando la variable.

        var mySecondVariable: String = myFirstVariable //Sobreescribiendo variables.

        println(mySecondVariable) //Imprimiendo mySecondVariable.

        //Constantes.
        //val mySecondConstant: String = myFirstVariable //Sobreescribiendo myFirstVariable.

        val myFirstConstant = "prueba constante"

        println(myFirstConstant)

    }

    private fun TiposdeDatos()
    {
        /*
        * String
        * Enteros
        * Decimales
        * Booleano
        * */

        val myString = "Prueba String"
        val myString2 = "sumar pruebas"
        val myString3: String = myString + " " + myString2

        println(myString3)

        //Enteros: Byte -127 a +128, Short -32768 + 32767, long

        val myInt = 100
        val myInt2 = 200

        val myInt3 = myInt + myInt2

        print(myInt3)

        //Decimales: Float 32 bits doublef hasta 64 bits

        val myDouble = 100.5
        val myFloat = 1.5f
        val myDouble2 = 200.5
        val myDouble3 = 10

        val myDouble4 = myDouble + myDouble2 + myDouble3

        println(myDouble4)

        //Datos booleanos
        val myBool = true
        val myBool2 = false
    }

    private fun sentenciaIf()
    {
        var myFirstVariable = "Esta es una prueba"
        var myFirstNumber = 2

        if(myFirstNumber <= 10)
        {
            println("$myFirstNumber es menor igual que 10")
        }
    }
}