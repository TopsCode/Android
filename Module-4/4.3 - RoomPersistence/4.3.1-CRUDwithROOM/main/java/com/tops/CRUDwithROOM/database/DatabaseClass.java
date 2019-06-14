package com.tops.CRUDwithROOM.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.tops.CRUDwithROOM.entity.User;
import com.tops.CRUDwithROOM.dao.DaoClass;

@Database(entities = User.class, version = 1)
public abstract class DatabaseClass extends RoomDatabase {
    public abstract DaoClass daoClass();
}
