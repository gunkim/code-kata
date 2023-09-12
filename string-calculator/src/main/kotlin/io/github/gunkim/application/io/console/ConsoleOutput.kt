package io.github.gunkim.application.io.console

import io.github.gunkim.application.io.Output

class ConsoleOutput : Output {
    override fun inputMessage() = println("숫자를 입력해주세요.")

    override fun resultMessage(result: Int) = println("결과는 = $result")
}
