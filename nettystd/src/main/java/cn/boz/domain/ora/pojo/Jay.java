package cn.boz.domain.ora.pojo;

public class Jay {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZHSPDEV.JAY.ID
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZHSPDEV.JAY.NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZHSPDEV.JAY.desc
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZHSPDEV.JAY.ID
     *
     * @return the value of ZHSPDEV.JAY.ID
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZHSPDEV.JAY.ID
     *
     * @param id the value for ZHSPDEV.JAY.ID
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZHSPDEV.JAY.NAME
     *
     * @return the value of ZHSPDEV.JAY.NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZHSPDEV.JAY.NAME
     *
     * @param name the value for ZHSPDEV.JAY.NAME
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZHSPDEV.JAY.desc
     *
     * @return the value of ZHSPDEV.JAY.desc
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZHSPDEV.JAY.desc
     *
     * @param desc the value for ZHSPDEV.JAY.desc
     *
     * @mbg.generated Wed Sep 26 11:36:41 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}