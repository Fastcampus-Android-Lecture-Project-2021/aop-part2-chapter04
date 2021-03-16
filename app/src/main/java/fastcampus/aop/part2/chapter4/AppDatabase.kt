package fastcampus.aop.part2.chapter4

import androidx.room.Database
import androidx.room.RoomDatabase
import fastcampus.aop.part2.chapter4.dao.HistoryDao
import fastcampus.aop.part2.chapter4.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}