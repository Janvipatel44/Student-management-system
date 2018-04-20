package StudentManagement.Model.studentModel;



public class EducationDetails
{
        private String sclname_10;
        private String sclname_12;
	private double percentile10;
	private double percentile12;
	private double jeeMark;
        private int acpcNo;
        
        public void setSclName_10(String sclname_10)
        {
            this.sclname_10 = sclname_10;
        }
        public String getSclName_10()
        {
            return sclname_10;
        }
        public void setSclName_12(String sclname_12)
        {
            this.sclname_12 = sclname_12;
        }
        public String getSclName_12()
        {
            return sclname_12;
        }
        public void setPercentile10(double percentile10)
        {
            this.percentile10 = percentile10;
        }
        public double getPercentile10()
        {
            return percentile10;
        }
        public void setPercentile12(double percentile12)
        {
            this.percentile12 = percentile12;
        }
        public double getPercentile12()
        {
            return percentile12;
        }
        public void setJeeMark(double jeeMark)
        {
            this.jeeMark = jeeMark;
        }
        public double getJeeMark()
        {
            return jeeMark;
        }
        public void setAcpcNo(int acpcNo)
        {
            this.acpcNo = acpcNo;
        }
        public int getAcpcNo()
        {
            return acpcNo;
        }

}
