package Variable;

import android.app.Application;

public class GlobalVariable extends Application {

    //是否旋轉過 立直 還是 橫放
    private Boolean Rotate_Check = false;

    public void setRotate_Check(Boolean rotate_Check) {
        Rotate_Check = rotate_Check;
    }

    public Boolean getRotate_Check() {
        return Rotate_Check;
    }


    //是不是最後一次的位置
    private Boolean LastPosition_Check = false;

    public void set_LastPosition_Check(Boolean LastPosition_Check) {
        this.LastPosition_Check = LastPosition_Check;
    }
    public Boolean get_LastPosition_Check() {
        return LastPosition_Check;
    }

    //最後偵測到的DOA
    double LastDirectionAngle = 0;

    public void set_LastDirectionAngle(double LastDirectionAngle) {
        this.LastDirectionAngle = LastDirectionAngle;
    }

    public double get_LastDirectionAngle() {
        return LastDirectionAngle;
    }
    //最新DOA
    double NewLastDirectionAngle = 0;

    public void set_NewLastDirectionAngle(double NewLastDirectionAngle) {
        this.NewLastDirectionAngle = NewLastDirectionAngle;
    }

    public double get_NewLastDirectionAngle() {
        return NewLastDirectionAngle;
    }


    //flag 用於確認次否角度有值
    Boolean LastDirectionAngle_Check = false;

    public void set_LastDirectionAngle_Check(Boolean LastDirectionAngle_Check) {
        this.LastDirectionAngle_Check = LastDirectionAngle_Check;
    }

    public Boolean get_LastDirectionAngle_Check() {
        return LastDirectionAngle_Check;
    }

    Boolean NewDirectionAngle_Check = false;

    public void set_NewDirectionAngle_Check(Boolean NewDirectionAngle_Check) {
        this.NewDirectionAngle_Check = NewDirectionAngle_Check;
    }

    public Boolean get_NewDirectionAngle_Check() {
        return NewDirectionAngle_Check;
    }

    //取得旋轉角度 第一次
    int FirstRotateAngle;

    public void setFirstRotateAngle(int FirstRotateAngle) {
        this.FirstRotateAngle = FirstRotateAngle;
    }

    public int getFirstRotateAngle() {
        return FirstRotateAngle;
    }

    //取得旋轉角度 第二次
    int SecondRotateAngle;

    public void setSecondRotateAngle(int secondRotateAngle) {
        this.SecondRotateAngle = secondRotateAngle;
    }

    public int getSecondRotateAngle() {
        return SecondRotateAngle;
    }

    //360 - 第一次+第二次角度 等於旋轉角度!? (順時針)


    //第一次的TDOA
    double FirstTDOA;

    public void setFirstTDOA(double firstTDOA) {
        this.FirstTDOA = firstTDOA;
    }

    public double getFirstTDOA() {
        return FirstTDOA;
    }

    //第二次的TDOA
    double SecondTDOA;

    public void setSecondTDOA(double secondTDOA) {
        this.SecondTDOA = secondTDOA;
    }

    public double getSecondTDOA() {
        return SecondTDOA;
    }

    //上一次的GPS位置
    double LastLongitude;
    public void setLastLongitude(double lastLongitude) {
        this.LastLongitude = lastLongitude;
    }
    public double getLastLongitude() {
        return LastLongitude;
    }

    double LastLatitude;
    public void setLastLatitude(double lastLatitude) {
        this.LastLatitude = lastLatitude;
    }
    public double getLastLatitude() {
        return LastLatitude;
    }

}
