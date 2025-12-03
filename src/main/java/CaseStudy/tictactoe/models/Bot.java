package CaseStudy.tictactoe.models;

import CaseStudy.tictactoe.strategies.BotStrategy;
import CaseStudy.tictactoe.strategies.BotStrategyFactory;

public class Bot extends Player {
    private BotDifficulty botDifficulty;
    private BotStrategy botStrategy;

    public Bot(String name, Symbol symbol, BotDifficulty botDifficulty) {
        super(name, symbol, PlayerType.BOT);
        this.botDifficulty = botDifficulty;
        this.botStrategy = BotStrategyFactory.getStrategy(botDifficulty);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Bot " + getName() + " is making a move.");
        return botStrategy.makeMove(board, this);
    }
}
