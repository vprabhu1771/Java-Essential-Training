public class Train {
     protected int train_no;
    protected String train_name;

    Train(int no, String n)
    {
        this.train_no = no;
        this.train_name = n;
    }

    void setTrainData(int no, String n)
    {
        this.train_no = no;
        this.train_name = n;
    }

    void getTrainData()
    {
        System.out.println("Train no : " + train_no + "\nTrain Name : " +train_name);
    }
}
