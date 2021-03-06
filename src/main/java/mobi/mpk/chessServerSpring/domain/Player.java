package mobi.mpk.chessServerSpring.domain;


import mobi.mpk.chessServerSpring.User;
import mobi.mpk.chessServerSpring.domain.figure.Figure;
import mobi.mpk.chessServerSpring.domain.rules.InspectorRules;

public class Player {

    private User user;
    private Color colorFigures;

    public Player(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public void move(Stroke stroke, Board board, InspectorRules inspectorRules) throws Exception {

        inspectorRules.checkMoveRules(board, stroke, this.colorFigures);

        Cell from = stroke.getFrom();
        Cell to = stroke.getTo();

        from = board.getCell(from);
        to = board.getCell(to);

        Figure figure = from.getFigure();
        to.setFigure(figure);
        from.setFigure(null);

    }

    public Color getColorFigures() {
        return colorFigures;
    }

    public void setColorFigures(Color colorFigures) {
        this.colorFigures = colorFigures;
    }

}
