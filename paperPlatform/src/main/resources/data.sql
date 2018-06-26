INSERT INTO contract (id, boundry, agent, fundation, series, start_date, end_date, master_type, detail_type, tips, paper_no, end_reason) 
	VALUES (1, '境內', 'ALL','ALL','ALL',CURRENT_DATE(),parsedatetime('17-09-2022 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),'銷售主約','費用','','','');
INSERT INTO paper (id, buzz_type, paper_name, start_date, end_date, contract_no, version_no, bookmark, relate_paper_no, relate_paper_name) 
	VALUES (1, '特定金錢信託', '繼承申請書',CURRENT_DATE(),parsedatetime('17-09-2022 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),'','','備註','','');