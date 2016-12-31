package pkuhit.me.dao.auto.entity;

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
public class MeObjListener implements EntityListener<MeObj> {

    @Override
    public void preInsert(MeObj entity, PreInsertContext<MeObj> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(MeObj entity, PreUpdateContext<MeObj> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdDeptCd = session.getDeptId();    	
    }

    @Override
    public void preDelete(MeObj entity, PreDeleteContext<MeObj> context) {
    }

    @Override
    public void postInsert(MeObj entity, PostInsertContext<MeObj> context) {
    }

    @Override
    public void postUpdate(MeObj entity, PostUpdateContext<MeObj> context) {
    }

    @Override
    public void postDelete(MeObj entity, PostDeleteContext<MeObj> context) {
    }
}