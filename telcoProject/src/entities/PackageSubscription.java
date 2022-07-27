package entities;

public class PackageSubscription{

	private int id;
	private Package packageId;
	private Subscription subscriptionId;
	
	
	public PackageSubscription() {
		super();
	}

	public PackageSubscription(int id, Package packageId, Subscription subscriptionId) {
		super();
		this.id = id;
		this.packageId = packageId;
		this.subscriptionId = subscriptionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Package getPackageId() {
		return packageId;
	}

	public void setPackageId(Package packageId) {
		this.packageId = packageId;
	}

	public Subscription getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(Subscription subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	
	
	
}
