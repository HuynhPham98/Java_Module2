package ThuatToanSapXepVaTimKiem.EX9;

import ThuatToanSapXepVaTimKiem.Sorting.SortAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam(1,"Duong",11,10));
        teams.add(new FootballTeam(2,"Minh",10,1));
        teams.add(new FootballTeam(3,"Tuấn phò mã",5,6));
        Comparator<FootballTeam> scoreComparator = (t1, t2) -> Integer.compare(t2.getScore(), t1.getScore());

        SortAlgorithms.bubbleSort(teams,Comparator.comparingInt(FootballTeam::getScore));
    }
}
