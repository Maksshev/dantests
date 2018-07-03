package core.stat;

import core.OneQuestion;

import java.util.List;

public class StatisticsPersonalized implements Statistics {
    private final int userId;

    public StatisticsPersonalized(int id) {
        this.userId=id;
    }

    @Override
    public int done() {
        return 0;
    }

    @Override
    public int left() {
        return 0;
    }

    @Override
    public List<OneQuestion> doneItems() {
        return null;
    }

    @Override
    public List<OneQuestion> leftItems() {
        return null;
    }
}