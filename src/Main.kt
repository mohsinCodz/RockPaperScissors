
fun main() {
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissor? Enter your Choice")
    playerChoice = readln()
    val randomNumber = (1..3).random()
    when(randomNumber){
        1 -> {
            println("Rock")
        }
        2 -> {
            println("Paper")
        }
        3 -> {
            println("Scissor")
        }
    }
    val winner = when{
        computerChoice == playerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Paper" -> "Player"
        playerChoice == "Paper" && computerChoice == "Scissor" -> "Player"
        playerChoice == "Scissor" && computerChoice == "Rock" -> "Player"
        else -> "Computer"
    }
    if (winner == "Tie"){
        println("It's a Tie")
    }else if (winner == "Player"){
        println("Player Won!")
    }else{
        println("Computer WIn!")
    }
}