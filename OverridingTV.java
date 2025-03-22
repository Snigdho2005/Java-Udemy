class TV 
{
    public void switchON()
    {
       System.out.println("TV is switched ON");
    }

    public void changeChannel()
    {
       System.out.println("TV channel is changed");
    }
}

class SmartTV extends TV
{
    public void switchON()
    {
       System.out.println("Smart TV is switched ON");
    }

    public void changeChannel()
    {
       System.out.println("Smart TV channel is changed");
    }

    public void browse()
    {
         System.out.println("Smart TV browsing");
    }
}

public class OverridingTV {
    public static void main(String[] args)
    {   
        /*
        TV t = new TV();
        t.switchON();
        t.changeChannel();
        */

        /*
        SmartTV st = new SmartTV();
        st.switchON();
        st.changeChannel();
        st.browse();
        */

        TV t = new SmartTV();
        t.switchON();
        t.changeChannel();
    }
}
