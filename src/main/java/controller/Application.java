package controller;

import exception.OutOfCarNameLengthException;
import model.RacingGame;
import util.StringConverter;
import view.InputView;
import view.ResultView;

public class Application {
    public static void main(String[] args) throws OutOfCarNameLengthException {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        RacingGame racingGame = new RacingGame();

        String carNames = inputView.inputCarNames();
        int attemptNumber = inputView.inputAttemptNumber();

        racingGame.setGame(attemptNumber, StringConverter.convertCarNamesToCarList(carNames));
        racingGame.start();
        resultView.printRacingGameResult(racingGame);
    }
}