package net.muratec.mcs.model;

public class Ohb {
    private String tscId;

    private String ohbName;

    private String e10State;

    private String e10StateSetTime;

    private String e10StateSetOriginator;

    public String getTscId() {
        return tscId;
    }

    public void setTscId(String tscId) {
        this.tscId = tscId == null ? null : tscId.trim();
    }

    public String getOhbName() {
        return ohbName;
    }

    public void setOhbName(String ohbName) {
        this.ohbName = ohbName == null ? null : ohbName.trim();
    }

    public String getE10State() {
        return e10State;
    }

    public void setE10State(String e10State) {
        this.e10State = e10State == null ? null : e10State.trim();
    }

    public String getE10StateSetTime() {
        return e10StateSetTime;
    }

    public void setE10StateSetTime(String e10StateSetTime) {
        this.e10StateSetTime = e10StateSetTime == null ? null : e10StateSetTime.trim();
    }

    public String getE10StateSetOriginator() {
        return e10StateSetOriginator;
    }

    public void setE10StateSetOriginator(String e10StateSetOriginator) {
        this.e10StateSetOriginator = e10StateSetOriginator == null ? null : e10StateSetOriginator.trim();
    }
}