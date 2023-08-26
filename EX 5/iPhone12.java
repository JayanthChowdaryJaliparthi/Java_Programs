class iPhone6 
{
    void makeCalls()
	{
        System.out.println("Calling feature");
    }
}
class iPhone10 extends iPhone6
{

    void unlockPhoneByFaceId()
	{
        System.out.println("face Id");
    }

}
class iPhone12 extends iPhone10
{

    void supportFor5GNetwork()
	{
        System.out.println("5G network support");
    }

    public static void main(String[] args) 
	{
        iPhone12 iPhone = new iPhone12();
        iPhone.makeCalls(); 
        iPhone.unlockPhoneByFaceId(); 
        iPhone.supportFor5GNetwork(); 
    }
}