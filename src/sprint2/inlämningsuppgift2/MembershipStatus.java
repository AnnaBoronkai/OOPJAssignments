package sprint2.inlämningsuppgift2;

public enum MembershipStatus {

    CURRENT_MEMBER ("Kunden är en nuvarande medlem. "),
    EX_MEMBER("Kunden är en före detta medlem.") ,
    UNAUTHORIZED ("Personen har aldrig varit medlem och är obehörig");

    private String membership;

    MembershipStatus(String membership) {
        this.membership = membership;

    }

    public String getMembership() {
        return membership;
    }
}
