package tech.lapsa.insurance.shared.jms;

public final class InsuranceDestinations {

    private InsuranceDestinations() {
    }

    public static final String NOTIFIER_NEW_CASCO_COMPANY_EMAIL = "insurance/jms/events/notifier/cascoNewCompanyEmail";
    public static final String NOTIFIER_NEW_CASCO_USER_EMAIL = "insurance/jms/events/notifier/cascoNewUserEmail";
    public static final String NOTIFIER_NEW_POLICY_COMPANY_EMAIL = "insurance/jms/events/notifier/policyNewCompanyEmail";
    public static final String NOTIFIER_NEW_POLICY_USER_EMAIL = "insurance/jms/events/notifier/policyNewUserEmail";
    public static final String NOTIFIER_NEW_INSURANCE_COMPANY_PUSH = "insurance/jms/events/notifier/newInsuranceCompanyPush";
    public static final String NOTIFIER_NEW_CALLBACK_COMPANY_PUSH = "insurance/jms/events/notifier/newCallbackCompanyPush";
    public static final String NOTIFIER_REQUEST_PAID_COMPANY_EMAIL = "insurance/jms/events/notifier/requestPaidCompanyEmail";

    public static final String NOTIFIER_PUSH_JOBS = "insurance/jms/events/notifier/pushJobs";
}
