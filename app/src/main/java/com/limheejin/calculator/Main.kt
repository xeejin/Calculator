package com.limheejin.calculator

import java.lang.System.exit

fun main() {

    while(true) {
        println("=============계산기=============")
        println("안녕하세요! 사칙연산 계산기입니다.")
        println("원하시는 기호를 입력해주세요. (+, -, *, /), 종료를 원할 시 -1을 입력해주세요.")
        val operator = readLine()!!
        if(operator == "-1"){
            println("계산을 종료하겠습니다. 이용해주셔서 감사합니다.")
            break
        }

        println("계산을 원하시는 정수 두 개를 입력해주세요. ")
        var num1 = readLine()!!.toInt()
        var num2 = readLine()!!.toInt()

        when (operator) {
            "+" -> {
                val addCalc = Calculator(AddOperation())
                println("결과는 ${addCalc.operate(num1, num2)}입니다.")
            }

            "-" -> {
                val minusCalc = Calculator(SubstractOperation())
                println("결과는 ${minusCalc.operate(num1, num2)}입니다.")
            }

            "*" -> {
                val multiplyCalc = Calculator(MultiplyOperation())
                println("결과는 ${multiplyCalc.operate(num1, num2)}입니다.")
            }

            "/" -> {
                val devideCalc = Calculator(DivideOperation())
                println("결과는 ${devideCalc.operate(num1, num2)}입니다.")
            }
            else -> println("잘못 입력하셨습니다. 계산기를 다시 구동해주세요.")
        }

    }
}