package jp.sobue.boot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BootAppApplication

fun main(args: Array<String>) {
  SpringApplication.run(BootAppApplication::class.java, *args)
}
