create index IX_2C077C11 on custom_Task (groupId);
create index IX_668C9572 on custom_Task (userId, name[$COLUMN_LENGTH:75$]);
create index IX_D6B5E3D9 on custom_Task (userId, status);
create index IX_54DCDE6D on custom_Task (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7AF41C2F on custom_Task (uuid_[$COLUMN_LENGTH:75$], groupId);