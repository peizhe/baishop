package com.baishop.entity.sale;

import java.io.Serializable;

public class UsersCredits implements Serializable {

	private static final long serialVersionUID = -8677218296094616445L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_credits.credits_id
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    private Integer creditsId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_credits.credits_name
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    private String creditsName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_credits.credits_logo
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    private String creditsLogo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_credits.min_points
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    private Long minPoints;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_credits.max_points
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    private Long maxPoints;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_credits.discount
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    private Byte discount;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_credits.credits_id
     *
     * @return the value of bai_credits.credits_id
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public Integer getCreditsId() {
        return creditsId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_credits.credits_id
     *
     * @param creditsId the value for bai_credits.credits_id
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public void setCreditsId(Integer creditsId) {
        this.creditsId = creditsId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_credits.credits_name
     *
     * @return the value of bai_credits.credits_name
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public String getCreditsName() {
        return creditsName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_credits.credits_name
     *
     * @param creditsName the value for bai_credits.credits_name
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public void setCreditsName(String creditsName) {
        this.creditsName = creditsName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_credits.credits_logo
     *
     * @return the value of bai_credits.credits_logo
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public String getCreditsLogo() {
        return creditsLogo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_credits.credits_logo
     *
     * @param creditsLogo the value for bai_credits.credits_logo
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public void setCreditsLogo(String creditsLogo) {
        this.creditsLogo = creditsLogo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_credits.min_points
     *
     * @return the value of bai_credits.min_points
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public Long getMinPoints() {
        return minPoints;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_credits.min_points
     *
     * @param minPoints the value for bai_credits.min_points
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public void setMinPoints(Long minPoints) {
        this.minPoints = minPoints;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_credits.max_points
     *
     * @return the value of bai_credits.max_points
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public Long getMaxPoints() {
        return maxPoints;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_credits.max_points
     *
     * @param maxPoints the value for bai_credits.max_points
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public void setMaxPoints(Long maxPoints) {
        this.maxPoints = maxPoints;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_credits.discount
     *
     * @return the value of bai_credits.discount
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public Byte getDiscount() {
        return discount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_credits.discount
     *
     * @param discount the value for bai_credits.discount
     *
     * @ibatorgenerated Fri Oct 14 16:32:44 CST 2011
     */
    public void setDiscount(Byte discount) {
        this.discount = discount;
    }
}