package com.zhy.smail.cabinet.entity;

import com.zhy.smail.lcp.BoxEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wenliz on 2017/2/24.
 */
public class BoardEntry {
    private Integer boardNo;
    private List<BoxEntry> boxEntrys;

    private Map<Integer, BoxEntry> boxEntryMap;

    public List<BoxEntry> getBoxEntrys() {
        return boxEntrys;
    }

    public void setBoxEntrys(List<BoxEntry> boxEntrys) {
        this.boxEntrys = boxEntrys;
    }

    public int[] getBoxIds(){
        int[] boxList = new int[boxEntrys.size()];
        for(int i = 0; i< boxEntrys.size(); i++){
            boxList[i] = boxEntrys.get(i).getBoxNo();
        }
        return boxList;
    }

    public BoxEntry getBoxEntry(Integer boxId){
        return boxEntryMap.get(boxId);
    }

    public void addEntry(BoxEntry boxEntry){
        BoxEntry entry = boxEntryMap.get(boxEntry.getBoxNo());
        if(entry != null){
            entry.setStatus(boxEntry.getStatus());
        }
        else{
            boxEntrys.add(boxEntry);
            boxEntryMap.put(boxEntry.getBoxNo(), boxEntry);
        }
    }

    public Integer getBoardNo() {

        return boardNo;
    }

    public void setBoardNo(Integer boardNo) {
        this.boardNo = boardNo;
    }

    public BoardEntry(){
        boxEntrys = new ArrayList<BoxEntry>();
        boxEntryMap = new HashMap<>();
    }

    public BoxEntry addBoxId(Integer boxId){
        BoxEntry boxEntry = boxEntryMap.get(boxId);
        if(boxEntry == null){
            boxEntry = new BoxEntry(boxId, -1);
            boxEntrys.add(boxEntry);
            boxEntryMap.put(boxId, boxEntry);
        }

        return boxEntry;
    }

    public void addBox(BoxInfo boxInfo){
        BoxEntry boxEntry =addBoxId(boxInfo.getControlSequence());
        boxEntry.setSequence(boxInfo.getSequence());
    }
}
