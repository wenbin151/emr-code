package pkuhit.xap.dao.auto.entity;

import java.sql.Timestamp;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

import pkuhit.xap.ac.Session;

/**
 * 
 */
public class XapPortalListener implements EntityListener<XapPortal> {

    @Override
    public void preInsert(XapPortal entity, PreInsertContext<XapPortal> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(XapPortal entity, PreUpdateContext<XapPortal> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdDeptCd = session.getDeptId();    	
    }

    @Override
    public void preDelete(XapPortal entity, PreDeleteContext<XapPortal> context) {
    }

    @Override
    public void postInsert(XapPortal entity, PostInsertContext<XapPortal> context) {
    }

    @Override
    public void postUpdate(XapPortal entity, PostUpdateContext<XapPortal> context) {
    }

    @Override
    public void postDelete(XapPortal entity, PostDeleteContext<XapPortal> context) {
    }
}