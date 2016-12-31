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
public class MeCdRuListener implements EntityListener<MeCdRu> {

    @Override
    public void preInsert(MeCdRu entity, PreInsertContext<MeCdRu> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
    }

    @Override
    public void preUpdate(MeCdRu entity, PreUpdateContext<MeCdRu> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public void preDelete(MeCdRu entity, PreDeleteContext<MeCdRu> context) {
    }

    @Override
    public void postInsert(MeCdRu entity, PostInsertContext<MeCdRu> context) {
    }

    @Override
    public void postUpdate(MeCdRu entity, PostUpdateContext<MeCdRu> context) {
    }

    @Override
    public void postDelete(MeCdRu entity, PostDeleteContext<MeCdRu> context) {
    }
}