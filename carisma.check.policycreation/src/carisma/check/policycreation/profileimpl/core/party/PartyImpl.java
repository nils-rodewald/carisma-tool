package carisma.check.policycreation.profileimpl.core.party;

import org.eclipse.emf.ecore.EObject;

import carisma.check.policycreation.UMLModelConverter;
import carisma.check.policycreation.profileimpl.core.ODRLClassImpl;

public class PartyImpl extends ODRLClassImpl {
	String uid;
	
	
	
	String uidName;



	public String getUid() {
		return uid;
	}



	public void setUid(String uid) {
		this.uid = uid;
	}
	
	@Override
	public void fill(EObject currentEObject, EObject activityElement, UMLModelConverter handler) {
		super.fill(currentEObject, activityElement, handler);
		Object attributeValue = UMLModelConverter.getValue(currentEObject, odrlPackage.getParty_Uid());
		if (attributeValue instanceof String stringValue && !stringValue.isEmpty()) {	
			this.setUid(stringValue);
		}
	}
	
}
