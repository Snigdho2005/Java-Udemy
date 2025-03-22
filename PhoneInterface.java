class Phone
{
    public void call()
    {
        System.out.println("Phone call");
    }
    public void sms()
    {
        System.out.println("Phone sending sms");
    }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void videoCall()
    {
        System.out.println("SmartPhone video calling");
    }
    public void click()
    {
        System.out.println("SmartPhone clicking photo");
    }
    public void record()
    {
        System.out.println("SmartPhone recording video");
    }
    public void play()
    {
        System.out.println("SmartPhone playing music");
    }
    public void stop()
    {
        System.out.println("SmartPhone stopping music");
    }
}

public class PhoneInterface
{
    public static void main(String[] args)
    {
        /*
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.sms();
        sp.videoCall();    
        sp.click();        
        sp.record();      
        sp.play();         
        sp.stop(); 
        */

        /* 
        Phone p = new SmartPhone();
        p.call();
        p.sms();
        */

        /*
        ICamera c = new SmartPhone();
        c.click();
        c.record();
        */

        IMusicPlayer m = new SmartPhone();
        m.play();
        m.stop();
    }
}