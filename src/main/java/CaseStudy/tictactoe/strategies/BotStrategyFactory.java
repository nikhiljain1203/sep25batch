package CaseStudy.tictactoe.strategies;

import CaseStudy.tictactoe.models.BotDifficulty;

public class BotStrategyFactory {
    public static BotStrategy getStrategy(BotDifficulty botDifficulty) {
        switch (botDifficulty) {
            case LOW:
                return new EasyBotStrategy();
            case MEDIUM:
                return new MediumBotStrategy();
            case HIGH:
                return new HardBotStrategy();
            default:
                throw new IllegalArgumentException("Invalid Bot Difficulty");
        }
    }
}
