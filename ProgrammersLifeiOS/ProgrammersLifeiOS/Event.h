//
//  Event.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/12/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "TimeStamp.h"

@interface Event : NSObject{
    TimeStamp *date;
}

// getter methods
-(TimeStamp*)getDate;

// setter methods
-(void)setData:(TimeStamp*)value;

@end