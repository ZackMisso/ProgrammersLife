//
//  MonthCalendar.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "MonthCalendar.h"

@implementation MonthCalendar

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}

-(void)initializeFromBeginning{
    // to be implemented
}

-(void)initializeMonth{
    if(currentMonth == 1){
        // to be implemented
    }else if(currentMonth == 2){
        // to be implemented
    }else if(currentMonth == 3){
        // to be implemented
    }else if(currentMonth == 4){
        // to be implemented
    }else if(currentMonth == 5){
        // to be implemented
    }else if(currentMonth == 6){
        // to be implemented
    }else if(currentMonth == 7){
        // to be implemented
    }else if(currentMonth == 8){
        // to be implemented
    }else if(currentMonth == 9){
        // to be implemented
    }else if(currentMonth == 10){
        // to be implemented
    }else if(currentMonth == 11){
        // to be implemented
    }else if(currentMonth == 12){
        // to be implemented
    }
}

// getter methods
-(NSMutableArray*)getDays { return days; }
-(NSString*)getTitle { return title; }
-(int)getCurrentMonth { return currentMonth; }

// setter methods
-(void)setEventReference:(EventController*)value { eventReference = value; }
-(void)setDays:(NSMutableArray*)value { days = value; }
-(void)setTitle:(NSString*)value { title = value; }
-(void)setCurrentMonth:(int)value { currentMonth = value; }

@end