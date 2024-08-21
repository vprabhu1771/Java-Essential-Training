public class Electric extends Train {
    private String type;

    private double fare;

    Electric(int no, String n, String t, double f)
    {
        super(no,n);

        type = t;

        fare = f;
    }


    void setElecticData(int no, String n, String t, double f)
    {
//        train_no = no;
//        train_name = n;

        setTrainData(no , n);
        type = t;
        fare = f;
    }

    void getElectricData()
    {
        getTrainData();

        System.out.println("Type : " + type);

        System.out.println("Fare : " + fare);
    }
}
