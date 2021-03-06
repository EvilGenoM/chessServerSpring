package mobi.mpk.chessServerSpring.rules.rule;

import mobi.mpk.chessServerSpring.domain.Board;
import mobi.mpk.chessServerSpring.domain.Cell;
import mobi.mpk.chessServerSpring.domain.Color;
import mobi.mpk.chessServerSpring.domain.Stroke;
import mobi.mpk.chessServerSpring.domain.exception.CellCorrectException;
import mobi.mpk.chessServerSpring.domain.exception.FigureNotFindException;
import mobi.mpk.chessServerSpring.domain.exception.StrokeCorrectException;
import mobi.mpk.chessServerSpring.domain.figure.Pawn;
import mobi.mpk.chessServerSpring.domain.rules.rule.stoke.figure.StrokeFigureRule;
import mobi.mpk.chessServerSpring.domain.rules.rule.stoke.figure.StrokePawnRule;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStrokePawnRule {

    private Board board;

    @Before
    public void before(){

        try {
            board = new Board();

            Cell cell = new Cell('a',2);
            cell = board.getCell(cell);

            cell.setFigure(new Pawn(Color.white));

            cell = new Cell('b',1);
            cell = board.getCell(cell);

            cell.setFigure(new Pawn(Color.white));

            cell = new Cell('a',7);
            cell = board.getCell(cell);

            cell.setFigure(new Pawn(Color.black));

            cell = new Cell('b',8);
            cell = board.getCell(cell);

            cell.setFigure(new Pawn(Color.black));

        } catch (CellCorrectException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testA2A4(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("a2 a4");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testA2A3(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("a2 a3");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testA2B3(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("a2 b3");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testB1B2(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("b1 b2");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testB1A2(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("b1 a2");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testB1C2(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("b1 c2");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testB1B3(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("b1 b3");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, false);

    }

    @Test
    public void testA7A5(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("a7 a5");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testA7A6(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("a7 a6");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testA7B6(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("a7 b6");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testB8B7(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("b8 b7");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testB8A7(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("b8 a7");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testB8C7(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("b8 c7");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, true);

    }

    @Test
    public void testB8B6(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("b8 b6");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, false);

    }

    @Test
    public void testA7A8(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("a7 a8");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, false);

    }

    @Test
    public void testA2A1(){

        StrokeFigureRule strokeFigureRule = new StrokePawnRule();

        Stroke stroke = null;
        try {
            stroke = new Stroke("a2 a1");
            stroke.findFigure(board);
        } catch (CellCorrectException e) {
            e.printStackTrace();
        } catch (StrokeCorrectException e) {
            e.printStackTrace();
        } catch (FigureNotFindException e) {
            e.printStackTrace();
        }
        boolean resultStroke = strokeFigureRule.checkRule(stroke);

        assertEquals(resultStroke, false);

    }

}
