package utils.db

import com.github.tminglei.slickpg._

trait PostgresDriver extends ExPostgresDriver with PgDate2Support {
  override val api = new API with DateTimeImplicits
}

object PostgresDriver extends PostgresDriver
