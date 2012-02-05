/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = 1365343852;

	/**
	 * The singleton instance of T_BOOK_STORE
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TBookStore T_BOOK_STORE = new org.jooq.test.oracle.generatedclasses.test.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The books store name
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("T_BOOK_STORE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TBookStore.T_BOOK_STORE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.UK_T_BOOK_STORE_NAME;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.UK_T_BOOK_STORE_NAME);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TBookStore as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TBookStore(alias);
	}
}
