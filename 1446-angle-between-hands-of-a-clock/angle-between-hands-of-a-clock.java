class Solution {
    public double angleClock(int hour, int minutes) {
        double hr_angle=(hour+(minutes/60.00))*30;
         double min_angle=(minutes*6.00);

        return Math.min(360-Math.abs(hr_angle-min_angle),Math.abs(hr_angle-min_angle));
    }
}