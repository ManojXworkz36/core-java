package com.xworkz.engineer;

public class EngineerExecutor {

    public static void main(String[] args) {

        Engineer eng = new CsEngineer();
        eng.problemSolving();

        CsEngineer cs=(CsEngineer) eng;
        cs.softwareDevelpment();

        Engineer eng1= new MarineEngine();
        MarineEngine marine=(MarineEngine) eng1;
        marine.enjoy();





    }
}
