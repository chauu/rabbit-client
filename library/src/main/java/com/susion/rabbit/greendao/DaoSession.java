package com.susion.rabbit.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.susion.rabbit.net.entities.RabbitHttpLogInfo;
import com.susion.rabbit.trace.entities.RabbitBlockFrameInfo;
import com.susion.rabbit.exception.entities.RabbitExceptionInfo;

import com.susion.rabbit.greendao.RabbitHttpLogInfoDao;
import com.susion.rabbit.greendao.RabbitBlockFrameInfoDao;
import com.susion.rabbit.greendao.RabbitExceptionInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig rabbitHttpLogInfoDaoConfig;
    private final DaoConfig rabbitBlockFrameInfoDaoConfig;
    private final DaoConfig rabbitExceptionInfoDaoConfig;

    private final RabbitHttpLogInfoDao rabbitHttpLogInfoDao;
    private final RabbitBlockFrameInfoDao rabbitBlockFrameInfoDao;
    private final RabbitExceptionInfoDao rabbitExceptionInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        rabbitHttpLogInfoDaoConfig = daoConfigMap.get(RabbitHttpLogInfoDao.class).clone();
        rabbitHttpLogInfoDaoConfig.initIdentityScope(type);

        rabbitBlockFrameInfoDaoConfig = daoConfigMap.get(RabbitBlockFrameInfoDao.class).clone();
        rabbitBlockFrameInfoDaoConfig.initIdentityScope(type);

        rabbitExceptionInfoDaoConfig = daoConfigMap.get(RabbitExceptionInfoDao.class).clone();
        rabbitExceptionInfoDaoConfig.initIdentityScope(type);

        rabbitHttpLogInfoDao = new RabbitHttpLogInfoDao(rabbitHttpLogInfoDaoConfig, this);
        rabbitBlockFrameInfoDao = new RabbitBlockFrameInfoDao(rabbitBlockFrameInfoDaoConfig, this);
        rabbitExceptionInfoDao = new RabbitExceptionInfoDao(rabbitExceptionInfoDaoConfig, this);

        registerDao(RabbitHttpLogInfo.class, rabbitHttpLogInfoDao);
        registerDao(RabbitBlockFrameInfo.class, rabbitBlockFrameInfoDao);
        registerDao(RabbitExceptionInfo.class, rabbitExceptionInfoDao);
    }
    
    public void clear() {
        rabbitHttpLogInfoDaoConfig.clearIdentityScope();
        rabbitBlockFrameInfoDaoConfig.clearIdentityScope();
        rabbitExceptionInfoDaoConfig.clearIdentityScope();
    }

    public RabbitHttpLogInfoDao getRabbitHttpLogInfoDao() {
        return rabbitHttpLogInfoDao;
    }

    public RabbitBlockFrameInfoDao getRabbitBlockFrameInfoDao() {
        return rabbitBlockFrameInfoDao;
    }

    public RabbitExceptionInfoDao getRabbitExceptionInfoDao() {
        return rabbitExceptionInfoDao;
    }

}
