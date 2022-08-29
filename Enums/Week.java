package OOPs.Enums;

public enum Week implements A{
    Monday, Tuesday , Wednesday , Thursday, Friday, Saturday, Sunday;
    // these are all enum constants
    // they are public final and static
    // type is week


    Week() {
        System.out.println("Constructor called for  " + this);
        // this is not public or protected, only private or default
        // why -> we don't want to create new objects -> that's not an enum concept
        // internally : public static final Week Monday = new Week();
    }

    @Override
    public void hello() {
        System.out.println("Hey How are you");
    }
}
